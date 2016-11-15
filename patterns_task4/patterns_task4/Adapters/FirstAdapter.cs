
using Example_04.Homework.Models;
using patterns_task4.Homework.Models;
using patterns_task4.FirstOrmLibrary;

namespace patterns_task4.Adapters
{
    class FirstAdapter : ITarget
    {
        private IFirstOrm<DbUserEntity> _firstOrmUser;
        private IFirstOrm<DbUserInfoEntity> _firstOrmUseInfo;

        public void CreateUser(DbUserEntity user)
        {
            _firstOrmUser.Create(user);
        }

        public void CreateUserInfo(DbUserInfoEntity userInfo)
        {
            _firstOrmUseInfo.Create(userInfo);
        }

        public void DeleteUser(DbUserEntity user)
        {
            _firstOrmUser.Delete(user);
        }

        public void DeleteUserInfo(DbUserInfoEntity userInfo)
        {
            _firstOrmUseInfo.Delete(userInfo);
        }

        public DbUserEntity ReadUser(int id)
        {
            return _firstOrmUser.Read(id);
        }

        public DbUserInfoEntity ReadUserInfo(int id)
        {
            return _firstOrmUseInfo.Read(id);
        }

        public void UpdateUser(DbUserEntity user)
        {
            _firstOrmUser.Update(user);
        }

        public void UpdateUserInfo(DbUserInfoEntity userInfo)
        {
            _firstOrmUseInfo.Update(userInfo);
        }
    }
}
