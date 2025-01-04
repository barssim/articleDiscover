package ma.solide.articlediscover.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "article")
public class Article {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer articleno;
	String name;
	String category;
	String description;
	String model;
	String type;
	Integer price;
	String oldNew;
	String image1;
	String image2;
	String image3;
	String status;
	Integer ownerNo;
	String manufacturer;
	String location;
}
