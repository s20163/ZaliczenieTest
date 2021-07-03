package pl.pjatk.SylKak.zaliczenieTest.TematZaliczenia.model;

import javax.persistence.*;

@Entity
public class ZaliczenieModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    @Enumerated(EnumType.STRING)
    private ZaliczenieEnum zaliczenieEnum;

    public ZaliczenieModel(Long id, String title, ZaliczenieEnum zaliczenieEnum) {
        this.id = id;
        this.title = title;
        this.zaliczenieEnum = zaliczenieEnum;
    }

    public ZaliczenieModel() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ZaliczenieEnum getTestModelEnum() {
        return zaliczenieEnum;
    }

    public void setTestModelEnum(ZaliczenieEnum zaliczenieEnum) {
        this.zaliczenieEnum = zaliczenieEnum;
    }
}
