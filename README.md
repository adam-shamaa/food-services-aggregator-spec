# food-services-aggregator-spec

## Table of Contents
1. [Technologies](#Technologies)
2. [Overview](#Overview)
3. [Getting Started](#Getting-Started)

## Technologies
- OpenAPI 3.0
- Java
    - Maven
    - OpenAPI Generator Maven Plugin
- Github Actions
- Github Pages
- Github Packages

## Overview
This repository houses the backend API specs for the food-services-aggregator server.

## Getting Started
1. Make changes directly to the OpenAPI spec [src/main/resources/openapi/openapi.yaml](https://github.com/adam-shamaa/food-services-aggregator-spec/blob/main/src/main/resources/openapi/openapi.yaml)
    
    Also update the mvn and npm package version by incrementing the OpenAPI spec version (package versions are inherited from the OpenAPI spec version)
2. You can preview the generated artifacts by running `mvn clean compile` then looking under `target/generated-sources/`


On pushes to the main branch, three jobs take place.
1. Server-side stubs and classes are generated and [published as a github mvn apache package](https://github.com/adam-shamaa/food-services-aggregator-spec/packages/1277138)
2. Client-side helpers and classes are generated and [published as a github npm package](https://github.com/adam-shamaa/food-services-aggregator-spec/pkgs/npm/food-services-aggregator-spec)
3. Swagger-ui page is generated and published to [github pages](https://adam-shamaa.github.io/food-services-aggregator-spec/)