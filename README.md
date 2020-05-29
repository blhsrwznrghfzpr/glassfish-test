# glassfish-test

Teratail質問用

## Setup
```terminal
# setup for Eclipse
./gradlew eclipse
```

## Run
```
# start app at 8081 port
./gradlew appRun

# start app at 8081 port (debug port: 5005)
./gradlew appRunDebug

# stop app
./gradlew appStop
```

## Build
```terminal
# generate war at /build/libs/
./gradlew build
```