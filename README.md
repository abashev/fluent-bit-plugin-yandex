# fluent-bit-plugin-yandex

Sidecar for Java applications with Logback

docker-compose.yml

```
    version: "3.8"
    services:
    translate-consumer:
        image: "cr.yandex/<registry>/hello"
        links:
        - fluentbit   # Use this name inside logback.xml

    fluentbit:
        image: "cr.yandex/<registry>/fluent-bit-plugin-yandex"
        ports:
        - 24224:24224
        - 24224:24224/udp
        restart: always
        environment:
        YC_GROUP_ID: <group id>
```
