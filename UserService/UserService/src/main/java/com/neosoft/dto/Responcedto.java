package com.neosoft.dto;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Responcedto {

    private Userdto userdto;
    private Policydto policydto;

    public Userdto getUserdto() {
        return userdto;
    }

    public void setUserdto(Userdto userdto) {
        this.userdto = userdto;
    }

    public Policydto getPolicydto() {
        return policydto;
    }

    public void setPolicydto(Policydto policydto) {
        this.policydto = policydto;
    }
}
