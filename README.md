Passo a Passo para Execução:
Certifique-se de que o Kafka está rodando (se estiver usando Docker):

bash
docker run -p 9092:9092 --name kafka quay.io/strimzi/kafka:latest
No terminal, na raiz do projeto pedido-service, execute:

Acesse o endpoint:

Criar pedido: POST http://localhost:8080/pedidos


curl -X POST http://localhost:8080/pedidos -H "Content-Type: application/json" -d '{"clienteId": 1, "itens": [{"produtoId": 101, "quantidade": 2}]}'  

# Verificar status (após 5 segundos)
curl http://localhost:8080/pedidos/1

docker compose

version: '3'

services:
  zookeeper:
    image: confluentinc/cp-zookeeper:latest
    environment:
      ZOOKEEPER_CLIENT_PORT: 2181
    ports:
      - "2181:2181"

  kafka:
    image: confluentinc/cp-kafka:latest
    depends_on:
      - zookeeper
    ports:
      - "9092:9092"
    environment:
      KAFKA_BROKER_ID: 1
      KAFKA_ZOOKEEPER_CONNECT: zookeeper:2181
      KAFKA_ADVERTISED_LISTENERS: PLAINTEXT://localhost:9092
      KAFKA_OFFSETS_TOPIC_REPLICATION_FACTOR: 1

