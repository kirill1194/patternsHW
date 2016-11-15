using Example_04.Homework.Models;
using patterns_task4.Homework.Models;

namespace patterns_task4.Adapters
{
    public interface ITarget
    {
        void CreateUser(DbUserEntity user);
        void CreateUserInfo(DbUserInfoEntity userInfo);
        DbUserEntity ReadUser(int id);
        DbUserInfoEntity ReadUserInfo(int id);
        void UpdateUser(DbUserEntity user);
        void UpdateUserInfo(DbUserInfoEntity userInfo);
        void DeleteUser(DbUserEntity user);
        void DeleteUserInfo(DbUserInfoEntity userInfo);
    }
}
