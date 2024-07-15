package mohaafaridd.dev.spring6di.services.datasource;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("qa")
@Service("datasourceService")
public class QADatasourceService implements DatasourceService {
    @Override
    public String getDatasource() {
        return "mongodb://qa.devsite.dev:27017/db";
    }
}
