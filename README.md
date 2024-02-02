## This is kafka application ##

There is two microservices, producer will send data to consumer based on kafka.
Kafka is one of best tool for live messaging. We can see transfer data with in seconds without many DB calls

If we want to develop kafka configration between two microservices we need platform like broker.
Those are Zookeeper,Confluent etc.

If we want to run application locally and send data with these services we need to open both kafka server and Zookeeper server.
These are the commands

### For Zookeeper: ###
    .\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties
### For Kafka: ###
     .\bin\windows\kafka-server-start.bat .\config\server.properties
