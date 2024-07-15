package mohaafaridd.dev.spring6di.services.datasource;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("production")
@Service("datasourceService")
public class ProductionDatasourceService implements DatasourceService {
    @Override
    public String getDatasource() {
        return "mongodb://prod.devsite.dev:27017/db";
    }
}
