package orng.drgn.oekofen.repo;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import orng.drgn.oekofen.client.Metric;

public interface MetricsRepo extends ElasticsearchRepository<Metric, String> {

}
