<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>구해줘용</title>
    <link href="${pageContext.request.contextPath}/css/reset.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/css/header.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/css/footer.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/css/resume_main.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/css/resume_update.css" rel="stylesheet">
</head>
<body>
    <header class="header">
        <div class="header_inner">
            <div class="menu">
                <button class="btn_menu">메뉴</button>
                <ul class="dropdown_menu">
                    <li class="menu_top">포지션 목록</li>
                    <li><a class="dropdown_item" href="#">백앤드 개발자</a></li>
                    <li><a class="dropdown_item" href="#">웹 퍼블리셔</a></li>
                    <li><a class="dropdown_item" href="#">프론트앤드 개발자</a></li>
                    <li class="menu_bottom">구직은 구해줘용과 함께</li>
                </ul>
            </div>
            <h1 class="logo"><a href="#">구해줘용</a></h1>
            <ul class="gnb">
                <li><a href="#">채용</a></li>
                <li><a href="../resume/resume_main">이력서</a></li>
            </ul>
            <ul class="login">
                <!--로그인시-->
                <li class="alert">
                    <a href="#">알림</a>
                    <ul class="alert_item_list">
                        <li><a class="alert_item">
                            <strong>알림제목</strong>
                            <p>알림내용</p>
                        </a></li>
                    </ul>
                </li>
                <li class="profile">
                    <a href="#">프로필</a>
                    <ul class="profile_list">
                        <li><a class="profile_item_mypage" href="#">My page</a></li>
                        <li><a class="profile_item" href="#">지원 현황</a></li>
                        <li><a class="profile_item" href="#">제안받기 현황</a></li>
                        <li><a class="profile_item" href="#">좋아요</a></li>
                        <li><a class="profile_item" href="#">구독</a></li>
                        <li><a class="profile_item_logout" href="#">로그아웃</a></li>
                    </ul>
                </li>
                <!--미 로그인시-->
                <!--
                <li><a href="#">로그인/회원가입</a></li>
                -->
            </ul>
            <ul class="companyservice">
                <li><a href="#">기업 서비스</a></li>
            </ul>
        </div>
    </header>