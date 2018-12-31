package com.cargomate.shipscontainers;

import java.util.List;

import com.cargomate.shipscontainers.model.Ship;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.BDDAssertions.then;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ShipsContainersMainTests {

	@LocalServerPort
	private int port;

	@Autowired
	private TestRestTemplate testRestTemplate;

	@Test
	public void shouldReturn200WhenGettingAllShips() throws Exception {
		@SuppressWarnings("rawtypes")
		ResponseEntity<List> entity = this.testRestTemplate.getForEntity(
				"http://localhost:" + this.port + "/get-all-ships", List.class);

		then(entity.getStatusCode()).isEqualTo(HttpStatus.OK);
		then(entity.getBody().size()).isEqualTo(165);
	}

	@Test
	public void shouldReturn200WhenGettingAShipById() throws Exception {
		@SuppressWarnings("rawtypes")
		ResponseEntity<Ship> entity = this.testRestTemplate.getForEntity(
				"http://localhost:" + this.port + "/get-ship" + "?id=1", Ship.class);

		then(entity.getStatusCode()).isEqualTo(HttpStatus.OK);
		then(entity.getBody()).isNotNull();
	}

	@Test
	public void shouldReturn200WhenGettingShipsByOwner() throws Exception {
		@SuppressWarnings("rawtypes")
		ResponseEntity<List> entity = this.testRestTemplate.getForEntity(
				"http://localhost:" + this.port + "/get-ships-by-owner" + "?owner=Maersk Line", List.class);

		then(entity.getStatusCode()).isEqualTo(HttpStatus.OK);
		then(entity.getBody().size()).isEqualTo(4);
	}

}

