package articlediscover.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Article {
	private int artNo;
	private String artName;
	private String artDestination;
	private int artPrice;
	private String artTransportCost;
}
