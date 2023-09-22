package Product;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product_info")
public class Product {
    @Id
    @Column(name = "product_id")
    private int productId;
    @Column(name = "product_name")
    private String productName;
    @Column(name = "product_price")
    private double productPrice;
    @Column(name = "product_cate")
    private String productCategory;
    @Column(name = "product_qnt")
    private int productQnt;

    public Product(int productId, String productName, double productPrice, String productCategory, int productQnt) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productCategory = productCategory;
        this.productQnt = productQnt;
    }
    public Product(){

    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public int getProductQnt() {
        return productQnt;
    }

    public void setProductQnt(int productQnt) {
        this.productQnt = productQnt;
    }

    @Override
    public String toString() {
        return productId+"\t"+productName+"\t"+productPrice+"\t"+productCategory+"\t"+productQnt;
    }
}
