# OOP_Java_codeptit
**Để ẩn file mà chưa cho vào .gitignore đã đẩy lên github**
- Ngay cả khi đã thêm vào .gitignore, các tệp này vẫn có thể bị theo dõi nếu chúng đã được đẩy lên GitHub trước đó. Để ngừng theo dõi chúng mà không xóa khỏi thư mục local, bạn cần sử dụng lệnh:
  + git rm -r --cached nbproject/
  + git rm --cached build.xml
  + git rm --cached manifest.mf

