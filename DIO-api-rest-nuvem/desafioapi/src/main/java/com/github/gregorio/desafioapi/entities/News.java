package com.github.gregbalb62.desafioapi.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "tb_news")
public class News extends BaseItem {

}
