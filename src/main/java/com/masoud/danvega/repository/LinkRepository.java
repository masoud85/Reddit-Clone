package com.masoud.danvega.repository;

import com.masoud.danvega.domain.Link;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LinkRepository extends JpaRepository<Link, Long> {

/*
    public Link findLastByTitleAndAndTitle(String title, String Url);
    public Link findLinkByTitleStartingWith(String linkBeginning);
*/

}
