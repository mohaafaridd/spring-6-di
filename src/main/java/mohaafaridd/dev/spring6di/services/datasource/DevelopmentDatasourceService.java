package mohaafaridd.dev.spring6di.services.datasource;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"development", "default"})
@Service("datasourceService")
public class DevelopmentDatasourceService implements DatasourceService {
    @Override
    public String getDatasource() {
        return "mongodb://localhost:27017/db";
    }
}
