package com.jeemyeong.request.job

import com.jeemyeong.request.domain.*
import com.jeemyeong.request.dto.*
import com.jeemyeong.request.helper.HeadersFactory
import com.jeemyeong.request.helper.RetryHelper
import org.springframework.http.HttpEntity
import org.springframework.http.HttpMethod
import org.springframework.web.client.RestTemplate
import org.springframework.web.client.exchange
import org.springframework.web.util.UriComponentsBuilder

class Job(
    val restTemplate: RestTemplate
){

    fun start() {
        HeadersFactory.token = "token"
    }

    fun getRoot(): Root? {
        val entity = HttpEntity<String>(HeadersFactory.getInstance())

        val url = UriComponentsBuilder.fromHttpUrl("https://swapi.co/api/").toUriString()
        return RetryHelper.retry(3) {
            restTemplate.exchange<Root>(url, HttpMethod.GET, entity).body
        }
    }

    fun getAllPeople(): List<Person> {
        val entity = HttpEntity<String>(HeadersFactory.getInstance())

        val url = UriComponentsBuilder.fromHttpUrl("https://swapi.co/api/people")
            .toUriString()
        return RetryHelper.retry(3) {
            restTemplate.exchange<AllPeopleDto>(url, HttpMethod.GET, entity).body
        }?.results ?: emptyList()
    }

    fun getPerson(id: Int): Person? {
        val entity = HttpEntity<String>(HeadersFactory.getInstance())

        val url = UriComponentsBuilder.fromHttpUrl("https://swapi.co/api/people/{id}/")
            .buildAndExpand(mapOf("id" to id))
            .toUriString()
        return RetryHelper.retry(3) {
            restTemplate.exchange<Person>(url, HttpMethod.GET, entity).body
        }
    }

    fun getAllFilms(): List<Film> {
        val entity = HttpEntity<String>(HeadersFactory.getInstance())

        val url = UriComponentsBuilder.fromHttpUrl("https://swapi.co/api/films")
            .toUriString()
        return RetryHelper.retry(3) {
            restTemplate.exchange<AllFilmsDto>(url, HttpMethod.GET, entity).body
        }?.results ?: emptyList()
    }

    fun getFilm(id: Int): Film? {
        val entity = HttpEntity<String>(HeadersFactory.getInstance())

        val url = UriComponentsBuilder.fromHttpUrl("https://swapi.co/api/films/{id}/")
            .buildAndExpand(mapOf("id" to id))
            .toUriString()
        return RetryHelper.retry(3) {
            restTemplate.exchange<Film>(url, HttpMethod.GET, entity).body
        }
    }

    fun getAllStarships(): List<Starship> {
        val entity = HttpEntity<String>(HeadersFactory.getInstance())

        val url = UriComponentsBuilder.fromHttpUrl("https://swapi.co/api/starships")
            .toUriString()
        return RetryHelper.retry(3) {
            restTemplate.exchange<AllStarshipsDto>(url, HttpMethod.GET, entity).body
        }?.results ?: emptyList()
    }

    fun getStarship(id: Int): Starship? {
        val entity = HttpEntity<String>(HeadersFactory.getInstance())

        val url = UriComponentsBuilder.fromHttpUrl("https://swapi.co/api/starships/{id}/")
            .buildAndExpand(mapOf("id" to id))
            .toUriString()
        return RetryHelper.retry(3) {
            restTemplate.exchange<Starship>(url, HttpMethod.GET, entity).body
        }
    }

    fun getAllSpecies(): List<Species> {
        val entity = HttpEntity<String>(HeadersFactory.getInstance())

        val url = UriComponentsBuilder.fromHttpUrl("https://swapi.co/api/species")
            .toUriString()
        return RetryHelper.retry(3) {
            restTemplate.exchange<AllSpeciesDto>(url, HttpMethod.GET, entity).body
        }?.results ?: emptyList()
    }

    fun getSpecies(id: Int): Species? {
        val entity = HttpEntity<String>(HeadersFactory.getInstance())

        val url = UriComponentsBuilder.fromHttpUrl("https://swapi.co/api/species/{id}/")
            .buildAndExpand(mapOf("id" to id))
            .toUriString()
        return RetryHelper.retry(3) {
            restTemplate.exchange<Species>(url, HttpMethod.GET, entity).body
        }
    }

    fun getAllPlanets(): List<Planet> {
        val entity = HttpEntity<String>(HeadersFactory.getInstance())

        val url = UriComponentsBuilder.fromHttpUrl("https://swapi.co/api/planets")
            .toUriString()
        return RetryHelper.retry(3) {
            restTemplate.exchange<AllPlanetsDto>(url, HttpMethod.GET, entity).body
        }?.results ?: emptyList()
    }

    fun getPlanet(id: Int): Planet? {
        val entity = HttpEntity<String>(HeadersFactory.getInstance())

        val url = UriComponentsBuilder.fromHttpUrl("https://swapi.co/api/planets/{id}/")
            .buildAndExpand(mapOf("id" to id))
            .toUriString()
        return RetryHelper.retry(3) {
            restTemplate.exchange<Planet>(url, HttpMethod.GET, entity).body
        }
    }

    fun getAllVehicles(): List<Vehicle> {
        val entity = HttpEntity<String>(HeadersFactory.getInstance())

        val url = UriComponentsBuilder.fromHttpUrl("https://swapi.co/api/vehicles")
            .toUriString()
        return RetryHelper.retry(3) {
            restTemplate.exchange<AllVehiclesDto>(url, HttpMethod.GET, entity).body
        }?.results ?: emptyList()
    }

    fun getVehicle(id: Int): Vehicle? {
        val entity = HttpEntity<String>(HeadersFactory.getInstance())

        val url = UriComponentsBuilder.fromHttpUrl("https://swapi.co/api/vehicles/{id}/")
            .buildAndExpand(mapOf("id" to id))
            .toUriString()
        return RetryHelper.retry(3) {
            restTemplate.exchange<Vehicle>(url, HttpMethod.GET, entity).body
        }
    }
}
