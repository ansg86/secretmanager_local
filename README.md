# installation

- pip install localstack awscli-local
- localstack start

# execute command below to create secret:
- awslocal secretsmanager create-secret --name dbsecret --secret-string "{\"dbuser\":\"postgres\",\"dbpassword\":\"password\"}"
