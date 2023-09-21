# healenium-serenity-example

[![Docker Pulls](https://img.shields.io/docker/pulls/healenium/hlm-backend.svg?maxAge=25920)](https://hub.docker.com/u/healenium)
[![License](https://img.shields.io/badge/license-Apache-brightgreen.svg)](https://www.apache.org/licenses/LICENSE-2.0)

Healenium with Robot-Framework usage example

[1. Start Healenium components](#1-start-healenium-components)
* [Healenium with Selenium-Grid](#run-healenium-with-selenium-grid)

[2. Configuration RemoteWebDriver](#2-configuration-remotewebdriver)

[3. Run test](#3-run-test)

## How to start

### 1. Start Healenium components

Go into healenium folder

    cd healenium

#### Run Healenium with Selenium-Grid:

    docker-compose up -d

<b>ATTENTION</b>

Verify the next images are <b>Up</b> and <b>Running</b>
- `postgres-db` (PostgreSQL database to store etalon selector / healing / report)
- `hlm-proxy` (Proxy client request to Selenium server)
- `hlm-backend` (CRUD service)
- `selector imitator` (Convert healed locator to convenient format)
- `selenium-grid` (Selenium server)

### 2. Configuration RemoteWebDriver

To run test using Healenium create RemoteWebDriver with URL ```http://<remote webdriver host>:8085```:

```editorconfig
headless.mode = false
webdriver {
  driver = remote
  remote {
    url="http://localhost:8085"
    driver=chrome
  }
}
```

### 3. Run test
To run tests in terminal with maven you need to go to execute next commands:

    mvn clean verify

## Community / Support

* [Telegram chat](https://t.me/healenium)
* [YouTube Channel](https://www.youtube.com/channel/UCsZJ0ri-Hp7IA1A6Fgi4Hvg)

