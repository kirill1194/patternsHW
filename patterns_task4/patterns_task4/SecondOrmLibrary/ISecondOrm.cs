using System.Collections.Generic;
using patterns_task4.Homework.Models;
using Example_04.Homework.Models;

namespace patterns_task4.SecondOrmLibrary
{
    public interface ISecondOrm
    {
        ISecondOrmContext Context { get; }
    }

    public interface ISecondOrmContext
    {
        HashSet<DbUserEntity> Users { get; }
        HashSet<DbUserInfoEntity> UserInfos { get; }
    }
}