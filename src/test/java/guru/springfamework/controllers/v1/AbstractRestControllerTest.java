package guru.springfamework.controllers.v1;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;

/**
 * Create by dmitri on 2022-11-07.
 */
@Slf4j
public abstract class AbstractRestControllerTest {

    public static String asJsonString(final Object obj) {
        try {
            var jsonAsString = new ObjectMapper().writeValueAsString(obj);
            log.debug("jsonAsString: {}", jsonAsString);
            return jsonAsString;
//            return new ObjectMapper().writeValueAsString(obj);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
