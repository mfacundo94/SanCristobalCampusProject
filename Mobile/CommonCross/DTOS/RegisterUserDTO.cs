﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CommonCross.DTOS
{
    public class RegisterUserDTO : PublicUserDTO
    {
        public string password { get; set; }
    }
}
