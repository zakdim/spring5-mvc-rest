package guru.springfamework.api.v1.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

/**
 * Create by dmitri on 2022-10-16.
 */
@Data
@AllArgsConstructor
public class CategoryListDTO {

    List<CategoryDTO> categories;
}
