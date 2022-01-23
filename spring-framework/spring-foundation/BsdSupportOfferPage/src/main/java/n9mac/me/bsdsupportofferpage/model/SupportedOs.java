package n9mac.me.bsdsupportofferpage.model;

import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.Date;

@Data
@Builder
public class SupportedOs {

    private final String name;
    private final String version;
    private String shortDescription;
    private final SupportModel support;
}
