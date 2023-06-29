FROM java:8

LABEL authors="xiaoshuai"

ADD User/target/User-0.0.1-SNAPSHOT.jar user.jar
ADD House/target/House-0.0.1-SNAPSHOT.jar house.jar
ADD Goods/target/Goods-0.0.1-SNAPSHOT.jar goods.jar
ADD Gateway/target/Gateway-0.0.1-SNAPSHOT.jar gateway.jar
ADD AD/target/AD-0.0.1-SNAPSHOT.jar ad.jar

COPY start.sh /usr/bin/start.sh
RUN chmod +x /usr/bin/start.sh


CMD nohup sh -c "start.sh"
