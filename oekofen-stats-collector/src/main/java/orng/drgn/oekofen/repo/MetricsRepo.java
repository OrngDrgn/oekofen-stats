package orng.drgn.oekofen.repo;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface MetricsRepo extends ElasticsearchRepository<Metric, String> {

}
