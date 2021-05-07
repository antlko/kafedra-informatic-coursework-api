package com.example.repository;

import com.example.entity.CustomPageInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomPagesInfoRepository extends JpaRepository<CustomPageInfo, Long> {
    Optional<CustomPageInfo> getByUrl(String url);
}
