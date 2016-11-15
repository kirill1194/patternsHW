using patterns_task4.SecondOrmLibrary;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Example_04.Homework.Models;
using patterns_task4.Homework.Models;

namespace patterns_task4.Adapters
{
    class SecondAdapter : ITarget
    {
        private readonly ISecondOrm _secondORD;
        public SecondAdapter(ISecondOrm secondOrm)
        {
            _secondORD = secondOrm;
        }

        public void CreateUser(DbUserEntity user)
        {
            _secondORD.Context.Users.Add(user);
        }

        public void CreateUserInfo(DbUserInfoEntity userInfo)
        {
            _secondORD.Context.UserInfos.Add(userInfo);
        }

        public void DeleteUser(DbUserEntity user)
        {
            _secondORD.Context.Users.Remove(user);
        }

        public void DeleteUserInfo(DbUserInfoEntity userInfo)
        {
            _secondORD.Context.UserInfos.Remove(userInfo);
        }

        public DbUserEntity ReadUser(int id)
        {
            foreach (DbUserEntity user in _secondORD.Context.Users)
                if (user.Id == id)
                    return user;
            return null;
        }

        public DbUserInfoEntity ReadUserInfo(int id)
        {
            foreach (DbUserInfoEntity user in _secondORD.Context.UserInfos)
                if (user.Id == id)
                    return user;
            return null;
        }

        public void UpdateUser(DbUserEntity user)
        {
            this.DeleteUser(user);
            this.CreateUser(user)
            
        }

        public void UpdateUserInfo(DbUserInfoEntity userInfo)
        {
            this.DeleteUserInfo(userInfo);
            this.CreateUserInfo(userInfo);
        }
    }
}
