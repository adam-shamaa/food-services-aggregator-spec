# food-services-aggregator-spec

## Table of Contents
1. [Overview](#Overview)
2. [Getting Started](#Getting-Started)
3. [Todo](#Todo)

## Overview
This repository houses the endpoint specs for the food-services-aggregator server. The technology of choice is OpenAPI 3.0 because of it's community support and popularity.

On pushes to the main branch, three jobs take place.
1. Server-side stubs and classes are generated for use in the server side and [published to a github package](https://github.com/adam-shamaa/food-services-aggregator-spec/packages/1277138)
2. Client-side helpers and classes are generated for use on the client side and [published to a github package](https://github.com/adam-shamaa/food-services-aggregator-spec/pkgs/npm/food-services-aggregator-spec)
3. A swagger-ui page is generated and published to [github pages](https://adam-shamaa.github.io/food-services-aggregator-spec/)

## Getting Started
Make changes directly to [src/main/resources/openapi/openapi.yaml](https://github.com/adam-shamaa/food-services-aggregator-spec/blob/main/src/main/resources/openapi/openapi.yaml)

## Improvements
- Auto bump version (a super tedious thing that I forget too often)
- Add ability to generate swagger ui on local development to act as preview (can simply copy and paste into an online tool but a nice to have)
- Make use of libraries that merge smaller files into a single generated openapi spec file (easier to digest and maintain a structured director and small files)


