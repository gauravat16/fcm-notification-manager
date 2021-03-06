# Hermes

Hermes allows you to create a pipeline for sending push notifications to your app's users depending on 
the parameters you push to hermes.

eg - Send this msg to all the users who are using dark mode and have app version 2.1.1

Data can be queried using a combination of GraphQL and Custom metadata query.

### Queries

**Query**

```   
getByQuery(customQuery:"deviceName %% 'Redm' $or  deviceName %% 'Pix' $and osVersion >= '28'") {
    deviceName
    osVersion
    appVersion
  }
```

**Response** 

````
{
  "data": {
    "getByQuery": [
      {
        "deviceName": "Pixel 3",
        "osVersion": "28",
        "appVersion": "3852"
      },
      {
        "deviceName": "Pixel 3",
        "osVersion": "28",
        "appVersion": "3852"
      },
      {
        "deviceName": "Pixel 3",
        "osVersion": "28",
        "appVersion": "3852"
      },
      {
        "deviceName": "Pixel 3",
        "osVersion": "28",
        "appVersion": "3852"
      },
      {
        "deviceName": "Redmi Note 7",
        "osVersion": "29",
        "appVersion": "3852"
      }
    ]
  }
}
````

#### Metadata Query

**Structure**

```<key1> <operation1> <value1> $and/$or <key2> <operation2> <value2>```

```deviceName %% 'Redm' $or  deviceName %% 'Pix' $and osVersion >= '28'```
