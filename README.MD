## dự án eshop

1. Cấu trúc package
   - config: cấu hình web, security
   - controller: điều hướng url
   - service: tập hợp interface định nghĩa hành động, mỗi tính năng,đã tạo file riêng
     - impl: file triển khai code logic cho service
   - storage: 
     - dto: chứa class truyền dữ liệu giữa các tầng
     - entity: chứa class mapping với bảng
     - repository: chứa interface truy vấn xuống DB, kế thừa JpaRepository
   - utils: chứa hàm dùng chung, custom exception
   - resource:
     - static: file tĩng, dùng luôn, ko cần thông qua controller để gọi
       - chứa file public html, truy cập trực tiếp, vd index.html, test.html
       - js: code js dùng chung
       - media: chứa font, ảnh
       - css: file css dùng chung
       - hệ thống file public html: menu
     - templates: file thymeleaf html
       - admin: chứa thư mục được phân theo tính năng, trong logic admin
       - user: chứa thư mục được phân theo tính năng, trong logic user
       - menu: menu chứa menu booking, menu user, menu admin
     - application file:
       - application-dev.properties: chạy môi trường dev

2. Luồng login: dùng session login, username & password
3. Hệ thống role: admin, user
4. File chạy dự án: EshopApplication.java
5. Lưu ý:
    - cách đặt tên file html, css, js: mỗi từ cách nhau dấu "_"
    - lúc làm ticket nên chạy file *application-dev.properties*
    - thông tin chung dự án: sheet "thong tin du an eshop"
      - link: https://docs.google.com/spreadsheets/d/18Lfpm04V5Y8xaQQ9ZJiRPtEO1qN-J_8s/edit?usp=sharing&ouid=105856002172010530960&rtpof=true&sd=true
