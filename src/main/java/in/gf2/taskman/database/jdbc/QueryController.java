package in.gf2.taskman.database.jdbc;

import org.springframework.stereotype.Component;

import in.gf2.taskman.database.model.QueryModel;
import in.gf2.taskman.database.model.QueryResponse;
import lombok.Data;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

@Component @Data
public class QueryController {
    final JdbcTemplate JdbcTemplate;
    final NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public QueryResponse update(QueryModel query) {
        return new QueryResponse(query, 0, false);
    }
}
