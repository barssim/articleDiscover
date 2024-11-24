package articlediscover.model;

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
@Table(name = "tb_article")
public class Article {
//	private int artNo;
//	private String artName;
//	private String artDestination;
//	private int artPrice;
//	private String artTransportCost;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "articleno")
	Integer articleno;
	@Column(name = "NAME")
	String articleName;
	@Column(name = "CATEGORYNO")
	Integer articleCategory;
	@Column(name = "DESCRIPTION")
	String articleDescription;
	@Column(name = "model")
	String articleModel;
	@Column(name = "type")
	String articleType;
	@Column(name = "PRICE")
	Integer articlePrice;
	@Column(name = "old_new")
	String articleOldNew;
//	@Column(name = "image1")
//	String articleImage1;
//	@Column(name = "image2")
//	String articleImage2;
//	@Column(name = "image3")
//	String articleImage3;
	@Column(name = "status")
	String articleStatus;
	@Column(name = "ownerNo")
	Integer OwnerNo;
	@Column(name = "MANUFACTURER")
	String Manufacturer;
}
