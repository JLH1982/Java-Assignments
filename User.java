class User {
    set name(value) {
        if (value.length < 1) {
            throw new Error('Please provide a name for the user');
        }
        this._name = value;
    }
    get name() {
        return this._name;
    }
}

const newUser = new User();
newUser.name = 'Justin';
console.log(newUser._name);
