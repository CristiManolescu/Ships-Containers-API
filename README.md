# ShipsContainers API

ShipsContainers is an API for the interview challenge described in the challenge.

# How to run
Run in IntelliJ or Eclipse the main class [ShipsContainersMain](/src/main/java/com/cargomate/shipscontainers/ShipsContainersMain.java) and try the endpoints in the browser or a software such as PostMan.

# API Endpoints

**Get all ships**
----
  Get all the ships (all the information in the "ships.json" file.

* **URL**
  /get-all-ships

* **Method:**
  `GET`

* **Success Response:**

  * **Code:** 200
  *  **Content:** `
        [
    {
        "id": 1,
        "built": 2017,
        "name": "OOCL Hong Kong",
        "lengthMeters": 399.87,
        "beamMeters": 58.8,
        "maxTEU": 21413,
        "owner": "OOCL (Hong Kong)",
        "grossTonnage": "210890"
    },
    ... ]
    `

* **Sample Call:**

```sh
curl -X GET \
  http://localhost:8080/get-all-ships \
  -H 'Content-Type: application/x-www-form-urlencoded' \
  -H 'cache-control: no-cache'
```

**Get a ship by id**
----
  Allow the user to get only information about one ship (filtered on the IMO number).

* **URL**
  /get-ship

* **Method:**
  `GET`

*  **URL Params**
   **Required:**
   `id=[long]`

* **Success Response:**

  * **Code:** 200
  *  **Content:** `
        {
            "id": 1,
            "built": 2017,
            "name": "OOCL Hong Kong",
            "lengthMeters": 399.87,
            "beamMeters": 58.8,
            "maxTEU": 21413,
            "owner": "OOCL (Hong Kong)",
            "grossTonnage": "210890"
        }
    `

* **Sample Call:**

```sh
curl -X GET \
  http://localhost:8080/get-ship?id=1 \
  -H 'Content-Type: application/x-www-form-urlencoded' \
  -H 'cache-control: no-cache'
```

**Get all ships by a specific owner**
----
  Get all the ships (all the information in the "ships.json" file.

* **URL**
  /get-ships-by-owner

* **Method:**
  `GET`

*  **URL Params**
   **Required:**
   `owner=[string]`

* **Success Response:**

  * **Code:** 200
  *  **Content:** `
        [
            {
                "id": 4,
                "built": 2017,
                "name": "Madrid Maersk",
                "lengthMeters": 399,
                "beamMeters": 58.6,
                "maxTEU": 20568,
                "owner": "Maersk Line",
                "grossTonnage": "214286"
            },
    ... ]
    `

* **Sample Call:**

```sh
curl -X GET \
  'http://localhost:8080/get-ships-by-owner?owner=Maersk%20Line' \
  -H 'Content-Type: application/x-www-form-urlencoded' \
  -H 'cache-control: no-cache'
```
