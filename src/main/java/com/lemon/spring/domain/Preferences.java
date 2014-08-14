
package com.lemon.spring.domain;

import lombok.Data;

@Data
public class Preferences {
    private boolean receiveNewsletter;
    private String[] interests;
    private String favouriteWord;

}
