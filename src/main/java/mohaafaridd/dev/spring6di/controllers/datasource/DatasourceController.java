package mohaafaridd.dev.spring6di.controllers.datasource;

import mohaafaridd.dev.spring6di.services.datasource.DatasourceService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class DatasourceController {
    private final DatasourceService datasourceService;

    public DatasourceController(@Qualifier("datasourceService") DatasourceService datasourceService) {
        this.datasourceService = datasourceService;
    }

    public String getDatasource() {
        return this.datasourceService.getDatasource();
    }
}
