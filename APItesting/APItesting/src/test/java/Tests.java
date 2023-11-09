import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Tests {

    @Test

    public void getExample() {
        Response response, response2, response3, response4, response5;
        response = given().get("https://swapi.dev/api/people/2");
        Assert.assertEquals(response.getStatusCode(), 200);
        // System.out.println(response.getBody().jsonPath().getString("skin_color"));
        // System.out.println(response.getBody().jsonPath().getString("films"));
        /*
         * int count = 1;
         * if(response.getBody().jsonPath().getString("skin_color").equalsIgnoreCase(
         * "gold"))
         * {
         * System.out.println("The color of skin is: " +
         * response.getBody().jsonPath().getString("skin_color"));
         * String cadena = response.getBody().jsonPath().getString("films");
         * for(int i = 0 ; i < cadena.length() ; i++)
         * {
         * if(cadena.charAt(i) == ',')
         * {
         * count ++;
         * }
         * }
         * }
         * System.out.println("La cantidad de pelis en las que aparece son: " + count);
         */
        // System.out.println(response.asPrettyString());
        if (response.getBody().jsonPath().getString("skin_color").equalsIgnoreCase("gold")) {
            System.out.println("The color of skin is: " + response.getBody().jsonPath().getString("skin_color"));
            System.out.println("The amount films when people/2/ appears is: "
                    + response.getBody().jsonPath().getList("films").size());
            String str = (String) response.getBody().jsonPath().getList("films").get(1);
            // System.out.println(str);
            response2 = given().get(str);
            Assert.assertEquals(response2.getStatusCode(), 200);
            // System.out.println(response2.asPrettyString());
            System.out.println("The date of the film is: " + response2.body().jsonPath().getString("release_date"));
            System.out.println("Los Personajes que aparecen: " + response2.body().jsonPath().getList("characters"));
            System.out.println("Los Planetas que aparecen: " + response2.body().jsonPath().getList("planets"));
            System.out.println("Las Naves que aparecen: " + response2.body().jsonPath().getList("starships"));
            System.out.println("Los Vehículos que aparecen: " + response2.body().jsonPath().getList("vehicles "));
            System.out.println("Las Especies que aparecen: " + response2.body().jsonPath().getList("species"));
            response3 = given().get(response2.body().jsonPath().getList("planets").get(0).toString());
            Assert.assertEquals(response3.getStatusCode(), 200);
            // System.out.println(response3.body().asPrettyString());
            String gravity = response3.body().jsonPath().getString("gravity");
            Assert.assertEquals(gravity, "1.1 standard");
            String terrains = response3.body().jsonPath().getString("terrain");
            Assert.assertEquals(terrains, "tundra, ice caves, mountain ranges");
            response4 = given().get(response3.body().jsonPath().getString("url"));
            String j1, j2;
            /*
             * System.out.println(response3.body().jsonPath().getString("edited"));
             * System.out.println();
             * System.out.println(response4.body().jsonPath().getString("edited"));
             */
            j1 = response3.body().asPrettyString();
            j2 = response4.body().asPrettyString();
            Assert.assertEquals(j1, j2);
            response5 = given().get("https://swapi.dev/api/films/7/");
            Assert.assertEquals(response5.getStatusCode(), 404);
        }
    }
}
