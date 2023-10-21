package one.digital.inovation.one.me.model;

import java.util.List;

import jakarta.persistence.*;


@Entity(name = "tb_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    @OneToOne(cascade = CascadeType.ALL)
    private Account Account;
    @OneToOne(cascade = CascadeType.ALL)
    private Card Card;
    @OneToMany(cascade = CascadeType.ALL, fetch =  FetchType.EAGER)
    private List<Feature> Features;
    @OneToMany(cascade = CascadeType.ALL, fetch =  FetchType.EAGER)
    private List<News> News;
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Account getAccount() {
        return Account;
    }
    public void setAccount(Account account) {
        Account = account;
    }
    public Card getCard() {
        return Card;
    }
    public void setCard(Card card) {
        Card = card;
    }
    public List<Feature> getFeatures() {
        return Features;
    }
    public void setFeatures(List<Feature> features) {
        Features = features;
    }
    public List<News> getNews() {
        return News;
    }
    public void setNews(List<News> news) {
        News = news;
    }


    
    
}
