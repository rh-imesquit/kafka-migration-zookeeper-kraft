# Red Hat streams for Apache Kafa Migration Lab (From Zookeeper to KRaft)


Let's apply a basic and simple lab to practice using this technology.


## Technologies Used

This lab was executed with the following specifications:

- Red Hat OpenShift 4.16
- Red Hat streams for Apache Kafka 2.9
- Quarkus 3.15.0 (Java 17)


## Provisioning the required infrastructure

Let's start by creating two projects in OpenShift to establish a logical isolation layer between the parts of our solution.
- kafka
- kafka-console
- application