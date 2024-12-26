
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





## API for Match

- #### Find all Matches

```http
    GET /api/matches
```

- #### Find Match by Id

```http
    GET /api/matches/{id}
```

- #### Create new Match

```http
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

```http
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

```http
    DELETE /api/matches/{id}
```
    
## API for MatchOdds

- #### Find all MatchOdds

```http
    GET /api/match-odds
```

- #### Find MatchOdds by MatchId

```http
    GET /api/matches/{matchId}
```

- #### Create new MatchOdds

```http
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

```http
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

```http
    DELETE /api/matches/{id}
```
    
