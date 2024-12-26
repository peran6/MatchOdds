
# Match-Odds API  
By Perantonakis Giannis





## Features

- CRUD opperations for Match
- CRUD opperations for MatchOdds




## Tech Stack

**Backend:** Java 17, Spring Boot 3.4.1

**Database:** PostgreSQL

**Other Libraris:** Lombok, JPA

**Deployment:** Docker


##  Execute

At project's path run 

```bash
  docker-compose up --build
```

From Postman, execute the bellow requests


All API endpoints are accessible under the following base URL: 
```bash
  http://localhost:8089
```

## API for Match

- #### Find all Matches

```bash
    GET /api/matches
```

- #### Find Match by Id

```bash
    GET /api/matches/{id}
```

- #### Create new Match

```bash
    POST /api/matches
    Content-Type: application/json
```

Request Body Example:
```http
{
  "description": "OSFP-PAO",
  "matchDate": "2025-12-25",
  "matchTime": "11:20",
  "teamA": "OSFP",
  "teamB": "PAO",
  "sport": 1
}
```

- #### Update Match By Id

```bash
    PUT /api/matches/{id}
    Content-Type: application/json
```

Request Body Example:
```http
{
  "description": "OSFP-PAO",
  "matchDate": "2025-12-25",
  "matchTime": "22:00",
  "teamA": "OSFP",
  "teamB": "PAO",
  "sport": 1
}
```

- #### Delete Match by Id

```bash
    DELETE /api/matches/{id}
```
    
## API for MatchOdds

- #### Find all MatchOdds

```bash
    GET /api/match-odds
```

- #### Find MatchOdds by MatchId

```bash
    GET /api/matches/{matchId}
```

- #### Create new MatchOdds

```bash
    POST /api/matches
    Content-Type: application/json
```

Request Body Example:
```http
{
  "match": {
    "id": 1
  },
  "specifier": "X",
  "odd": 1.8
}
```

- #### Update MatchOdd MatchId

```bash
    PUT /api/matches/{matchId}
    Content-Type: application/json
```

Request Body Example:
```http
{
  "match": {
    "id": 1
  },
  "specifier": "X",
  "odd": 2.0
}
```

- #### Delete MatchOdd by Id

```bash
    DELETE /api/matches/{id}
```
    
