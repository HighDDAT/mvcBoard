package com.spring.mypage.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.spring.mypage.domain.ArticleDTO;
import com.spring.mypage.persistence.ArticleDAO;

@Service
public class ArticleServiceImpl implements ArticleService {
	
	private final ArticleDAO articleDAO;
	
	@Inject
	public ArticleServiceImpl(ArticleDAO articleDAO) {
		this.articleDAO = articleDAO;
	}
	
	@Override
	public void create(ArticleDTO articleDTO) throws Exception {
		articleDAO.create(articleDTO);
	}
	
	@Override
	public ArticleDTO read(Integer article_no) throws Exception {
		return articleDAO.read(article_no);
	}
	
	@Override
	public void update(ArticleDTO articleDTO) throws Exception {
		articleDAO.update(articleDTO);
	}
	
	@Override
	public void delete(Integer article_no) throws Exception {
		articleDAO.delete(article_no);
	}
	
	@Override
	public List<ArticleDTO> listAll() throws Exception {
		return articleDAO.listAll();
	}

}
