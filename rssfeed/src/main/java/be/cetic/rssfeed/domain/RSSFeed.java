package be.cetic.rssfeed.domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.OneToMany;
import org.springframework.data.annotation.Id;

/**
 *
 * @author EXG503
 */
@Entity
public class RSSFeed  {

    @Id
    @GeneratedValue
    @Column(name = "rss_uri_id")
    @javax.persistence.Id
    private Long id;

    private String URI;
    private boolean active;
    
    @OneToMany()
    private List<Parameter> parameters ;

    public RSSFeed() {
    }
    
    

    public RSSFeed(String URI) {
        this.URI = URI;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getURI() {
        return URI;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Parameter> getParameters() {
        return parameters;
    }

    public void setParameters(List<Parameter> parameters) {
        this.parameters = parameters;
    }

    public void setURI(String URI) {
        this.URI = URI;
    }
    
    

}
