package org.uth;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class GreetingResponse {

    private String message;
    private String time;

}
