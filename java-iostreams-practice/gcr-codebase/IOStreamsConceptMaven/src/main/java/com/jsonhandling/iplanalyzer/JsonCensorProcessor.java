package com.jsonhandling.iplanalyzer;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.util.List;
import java.util.Map;

public class JsonCensorProcessor {

    public static void processJson(String input, String output) throws Exception {

        ObjectMapper mapper = new ObjectMapper();
        List<IPLMatch> matches =
                mapper.readValue(new File(input),
                        mapper.getTypeFactory()
                              .constructCollectionType(List.class, IPLMatch.class));

        for (IPLMatch match : matches) {
            match.setTeam1(CensorUtil.maskTeamName(match.getTeam1()));
            match.setTeam2(CensorUtil.maskTeamName(match.getTeam2()));
            match.setWinner(CensorUtil.maskTeamName(match.getWinner()));
            match.setPlayer_of_match(CensorUtil.redactPlayer());

            // Update score keys
            Map<String, Integer> score = match.getScore();
            score.replaceAll((k, v) -> v);
        }

        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        mapper.writeValue(new File(output), matches);
    }
}

