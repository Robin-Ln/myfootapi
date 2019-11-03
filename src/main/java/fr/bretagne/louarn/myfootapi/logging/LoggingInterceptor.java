package fr.bretagne.louarn.myfootapi.logging;

import lombok.AllArgsConstructor;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okio.Buffer;
import okio.BufferedSource;
import org.apache.commons.lang3.BooleanUtils;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Set;
import java.util.function.Consumer;

import static okhttp3.logging.HttpLoggingInterceptor.Level;

@AllArgsConstructor
public class LoggingInterceptor implements Interceptor {

    private Level level;
    private Consumer<String> logger;

    private static final Set<Level> BASIC_LEVEL = Set.of(Level.BASIC, Level.HEADERS, Level.BODY);
    private static final Set<Level> HEADER_LEVEL = Set.of(Level.BASIC, Level.HEADERS);
    private static final Set<Level> BODY_LEVEL = Set.of(Level.BODY);
    private static final String RETURN_LINE = "\n";


    @NotNull
    @Override
    public Response intercept(@NotNull Chain chain) throws IOException {

        Request request = chain.request();
        Response response = chain.proceed(request);

        if (level.equals(Level.NONE)) {
            return response;
        }

        StringBuilder requestBuilder = new StringBuilder();
        if (BASIC_LEVEL.contains(level)) {
            requestBuilder.append(String.format("Request %s %s", request.method(), request.url()));
        }

        StringBuilder responseBuilder = new StringBuilder();
        if (BASIC_LEVEL.contains(level)) {
            responseBuilder.append(String.format("Response %s %s", response.request().method(), response.request().url()));
            responseBuilder.append(RETURN_LINE);
            responseBuilder.append(String.format("%s", response.code()));
            responseBuilder.append(RETURN_LINE);
            responseBuilder.append(readBody(response));
        }


        String requestLog = requestBuilder.toString();
        if (BooleanUtils.isFalse(requestLog.isEmpty())) {
            logger.accept(requestLog);
        }

        String responseLog = responseBuilder.toString();
        if (BooleanUtils.isFalse(responseLog.isEmpty())) {
            logger.accept(responseLog);
        }

        return response;
    }

    private String readBody(Response response) throws IOException {
        BufferedSource source =  response.body().source();
        source.request(Long.MAX_VALUE);
        Buffer buffer = source.getBuffer().clone();
        Charset charset = Charset.forName("UTF-8");
        return buffer.readString(charset);
    }
}
