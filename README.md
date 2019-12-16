# My foot app

## Démarer le serveur

## Outils utilisés

### Rétrofit

### Maven

### Gitlab ci

### Spring

### Docker 

Pour configurer la profile spring il faut utiliser la varraible d'env : SPRING_PROFILES_ACTIVE

* Exemple de comande docker pour lancer la stack :

```
docker run image -e "ENV=prod" -p 8080:8080
```

### Lambok

### Mapstruc

### Sonar

```
mvn sonar:sonar \
  -Dsonar.projectKey=my-foot-api \
  -Dsonar.host.url=http://localhost:9000 \
  -Dsonar.login=1a5c0cd69f51f93c28b7dc036bbff4c9c4036065
```

### Google cloud 

#### Auth

```
gcloud auth print-access-token
```

```
gcloud auth activate-service-account gitlab-ci@my-foot-api.iam.gserviceaccount.com --key-file Downloads/my-foot-api-30a520882638.json
```

```
GOOGLE_APPLICATION_CREDENTIALS
```
