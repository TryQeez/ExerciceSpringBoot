package com.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONObject;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Ville {
    private String codeCommune;
    private String nomCommune;
    private String libelleAcheminement;
    private Coordonnee coordonnee;
}
