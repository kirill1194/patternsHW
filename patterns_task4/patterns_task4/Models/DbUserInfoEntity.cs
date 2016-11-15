using patterns_task4.Models.Interfaces;
using System;


namespace Example_04.Homework.Models
{
    public class DbUserInfoEntity : IDbEntity
    {
        public int Id { get; set; }
        public string Name { get; set; }
        public DateTime Birthday { get; set; }
    }
}
